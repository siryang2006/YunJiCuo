package com.dvp.base.fenwu.yunjicuo.common.model;

import android.content.Context;
import android.support.annotation.Nullable;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.domain.ClientVersion;
import com.dvp.base.fenwu.yunjicuo.common.domain.RtnClient;
import com.dvp.base.fenwu.yunjicuo.common.domain.RtnClientVersion;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.google.gson.Gson;
import com.lzy.okhttputils.OkHttpUtils;
import com.lzy.okhttputils.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
public class UpdateModel extends AppModel
{

    private Gson gson;

    public ClientVersion getClientVersion()
    {
        return clientVersion;
    }

    public void setClientVersion(ClientVersion clientVersion)
    {
        this.clientVersion = clientVersion;
    }

    public ClientVersion clientVersion = new ClientVersion();

    public UpdateModel(Context context) {
        super(context);
        gson = new Gson();

    }

    public void checkUpdate(final String apiCode) {
        OkHttpUtils
                .get(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.app_request_url)/* + apiCode*/)
                .tag(mContext)
                .execute(new StringCallback() {
                    @Override
                    public void onResponse(boolean isFromCache, String s, Request request, @Nullable Response response) {
                        try {
                            //获取数据   得到json数据，并解析
                            RtnClient rtnClientVersion = gson.fromJson(s,RtnClient.class);
                            //RtnClientVersion rtnClientVersion = gson.fromJson(s, RtnClientVersion.class);
                            if (null != rtnClientVersion.getVersion()) {
                                //clientVersion = rtnClientVersion.getClientVersion();

                                clientVersion.setVersion(rtnClientVersion.getVersion());
                                clientVersion.setApplicationCode(rtnClientVersion.getApplicationCode());
                                clientVersion.setDescription(rtnClientVersion.getDescription());
                                //clientVersion.setFilePath(mContext.getResources().getString(R.string.http_request_url)+rtnClientVersion.getAttach().get(0).getFilePath());
                                clientVersion.setIsMandatory(rtnClientVersion.getIsMandatory());
                                clientVersion.setUrl(mContext.getResources().getString(R.string.http_request_url)+rtnClientVersion.getAttach().get(0).getFilePath());
                                if (clientVersion.getApkName() == null || clientVersion.getApkName().equals("")) {
                                    //设置apk名称
                                    clientVersion.setApkName(mContext.getResources().getString(
                                            R.string.app_name) + ".apk");
                                }
                                if (clientVersion.getDescription() == null || clientVersion.getDescription().equals("")) {
                                    //设置apk名称
                                    clientVersion.setDescription("最新版本：v" + clientVersion.getVersion() +
                                            "\n更新时间：" + clientVersion.getUpdateTime());
                                }
                                //返回界面
                                OnHttpResponse(apiCode, null);
                            } else {
                                errorCallback("100", "数据解析异常");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            errorCallback("100", "数据解析异常");
                        }
                    }

                    @Override
                    public void onError(boolean isFromCache, Call call, @Nullable Response response, @Nullable Exception e) {
                        super.onError(isFromCache, call, response, e);
                        if (response != null)
                            errorCallback("" + response.code(), "错误编码：" + response.code() + "\n" + response.message());
                        else
                            errorCallback(null, null);
                    }
                });
    }
}
