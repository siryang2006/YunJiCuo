package com.dvp.base.fenwu.yunjicuo.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.update.UpdateAgent;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.LoginModel;
import com.dvp.base.fenwu.yunjicuo.ui.fragment.NewStudentFragment;
import com.dvp.base.fenwu.yunjicuo.ui.fragment.NewTeacherMenuFragment;
import com.dvp.base.fenwu.yunjicuo.ui.fragment.StuRecycleFragment;
import com.dvp.base.fenwu.yunjicuo.ui.fragment.TeaRecycleFragment;
import com.dvp.base.util.DoubleClickExitDetector;
import com.flyco.tablayout.SegmentTabLayout;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

import java.lang.reflect.Method;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends CommonActivity
        implements NavigationView.OnNavigationItemSelectedListener
{

    @Bind(R.id.tl_1)
    SegmentTabLayout tl1;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.fab)
    FloatingActionButton fab;
    @Bind(R.id.nav_view)
    NavigationView navView;
   /* @Bind(R.id.navright_view)
    NavigationView navrightView;*/
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.fl_content)
    FrameLayout flContent;


    private ArrayList<Fragment> mFragments3 = new ArrayList<>();//用户切换Fragment，不可滑动
    private String[] mTitles = {"老师", "学生"};//第一种样式tab的标题文字


    DoubleClickExitDetector exit = new DoubleClickExitDetector(MainActivity.this);//创建双击退出程序对象

    private LoginModel mModel;

    //APP_ID 替换为你的应用从官方网站申请到的合法appId
    private static final String APP_ID = "wxd930ea5d5a258f4f";

    //IWXAPI 是第三方app和微信通信的openapi接口
    private IWXAPI api;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //商户APP工程中引入微信JAR包，调用API前，需要先向微信注册您的APPID
        //initWeiXinZhiF();
        initDawLayout();
        initTab();
        init();
    }

    private void initWeiXinZhiF()
    {
        //通过WXAPIFactory工厂，获取IWXAPI实例
        api = WXAPIFactory.createWXAPI(this,APP_ID,true);
        //将应用的appId注册到微信
        api.registerApp(APP_ID);
    }
    private void init()
    {
        if(mModel == null)
        {
            mModel = new LoginModel(this);
        }
        mModel.addResponseListener(this);
        mModel.getUserInfo(getResources().getString(R.string.get_user_info_trancode),getAPP().getAppConfig().getConfig(User.class).getStaffId());
    }

    /**
     * 初始化侧滑菜单
     */
    private void initDawLayout()
    {
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);

        setTitle("云计错");
        setSupportActionBar(toolbar);

        //toolbar.setOnMenuItemClickListener(onMenuItemClick);

        toolbar.setNavigationIcon(R.mipmap.yh);
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                drawerLayout.openDrawer(GravityCompat.START);
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED,
                        GravityCompat.START);
            }
        });


        //左边滑动菜单
        navView.setNavigationItemSelectedListener(this);

      /*  需要的是彩色的图标，而不是统一的图标颜色。
        解决方法是调用 NavigationView 的 setItemIconTintList(ColorStateList tint) 方法，传入 null 参数：*/
        navView.setItemIconTintList(null);
        //右边滑动菜单
       // navrightView.setNavigationItemSelectedListener(this);
    }

    private void initTab()
    {

        mFragments3.add(TeaRecycleFragment.getInstance("TeaRecycleFragment"));
        mFragments3.add(StuRecycleFragment.getInstance("StuRecycleFragment"));
        tl1.setTabData(mTitles, this, R.id.fl_content, mFragments3);
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);//加载自定义的menu文件
        return true;
    }*/


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if(id == R.id.exit_item)
        {
            DialogUtil.getBasicDialog(MainActivity.this, null, "退出账号", "确定退出当前账号么？", 0, new MaterialDialog.SingleButtonCallback()
            {
                @Override
                public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which)
                {
                    exitApp();
                }
            }).show();

        }

        if(id == R.id.personcenter_item)
        {
            //检测是否有新版本
            UpdateAgent.autoUpdate(MainActivity.this);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
       // drawer.closeDrawer(GravityCompat.END);
        return true;
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu)
    {
        if (featureId == Window.FEATURE_ACTION_BAR && menu != null)
        {
            if (menu.getClass().getSimpleName().equals("MenuBuilder"))
            {
                try
                {
                    Method m = menu.getClass().getDeclaredMethod(
                            "setOptionalIconsVisible", Boolean.TYPE);
                    m.setAccessible(true);
                    m.invoke(menu, true);
                } catch (NoSuchMethodException e)
                {
                    e.printStackTrace();
                } catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
        return super.onMenuOpened(featureId, menu);
    }


    private Toolbar.OnMenuItemClickListener onMenuItemClick = new Toolbar.OnMenuItemClickListener()
    {
        @Override
        public boolean onMenuItemClick(MenuItem menuItem)
        {
            switch (menuItem.getItemId())
            {
                case R.id.action_mySetting:
                    //点击之后 右边抽屉就出来
                    drawerLayout.openDrawer(Gravity.RIGHT);
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED,
                            Gravity.RIGHT);
                    break;
              /*  case R.id.s_mySetting:
                    Toast.makeText(MainActivity.this, "测试", Toast.LENGTH_SHORT).show();
                    break;*/
            }
            return true;
        }
    };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == KeyEvent.KEYCODE_BACK)
        {
            if (exit.click())
            {
                exitApp();
            }
        }
        return true;
    }

    /**
     * 回调函数
     * @param var1
     * @param var2
     */
    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.get_user_info_trancode)))
        {
            View view = LayoutInflater.from(this).inflate(R.layout.left_nav_bar_layout, null);
            navView.addHeaderView(view);
            TextView nameTv = (TextView) view.findViewById(R.id.name_tv);
            nameTv.setText(mModel.getRtnUserInfo().getName());
            TextView mobile_tv = (TextView) view.findViewById(R.id.mobile_tv);
            mobile_tv.setText(mModel.getRtnUserInfo().getMobile().toString());
        }
    }
}