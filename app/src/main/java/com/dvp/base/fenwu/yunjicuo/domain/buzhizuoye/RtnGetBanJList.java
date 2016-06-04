package com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye;

import java.util.List;

/**
 * 作者：Administrator on 2016/6/2 16:38
 * <p>
 * 功能描述:布置作业获取班级
 */
public class RtnGetBanJList
{

    /**
     * page : 1
     * totalCount : 2
     * pageSize : 999999
     * orderCondition :  order by banJ.orderId,banJ.name
     * searchCondition :  where  user.id ='e54910245143f903015146aa3ab6042c' and banJ.keM.id ='2c90813a5074c128015074cb6707000b' and str(isValid) ='1' and str(type) !='1'
     * data : [{"typeName":"创建者","id":"e54910245143f903015146abd98b043d","valid":1,"validName":"正常","type":0,"user":{"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"},"yiShengUserNum":"60","banJ":{"id":"00000010","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"44班","user":{"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"}}},{"typeName":"创建者","id":"e549102453a2b4a30153abb2bd3b0bc3","valid":1,"validName":"正常","type":0,"user":{"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"},"yiShengUserNum":"57","banJ":{"id":"00000261","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"51班","user":{"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"}}}]
     */

    private int page;
    private int totalCount;
    private int pageSize;
    private String orderCondition;
    private String searchCondition;
    /**
     * typeName : 创建者
     * id : e54910245143f903015146abd98b043d
     * valid : 1
     * validName : 正常
     * type : 0
     * user : {"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"}
     * yiShengUserNum : 60
     * banJ : {"id":"00000010","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"44班","user":{"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"}}
     */

    private List<DataEntity> data;

    public int getPage()
    {
        return page;
    }

    public void setPage(int page)
    {
        this.page = page;
    }

    public int getTotalCount()
    {
        return totalCount;
    }

    public void setTotalCount(int totalCount)
    {
        this.totalCount = totalCount;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    public String getOrderCondition()
    {
        return orderCondition;
    }

    public void setOrderCondition(String orderCondition)
    {
        this.orderCondition = orderCondition;
    }

    public String getSearchCondition()
    {
        return searchCondition;
    }

    public void setSearchCondition(String searchCondition)
    {
        this.searchCondition = searchCondition;
    }

    public List<DataEntity> getData()
    {
        return data;
    }

    public void setData(List<DataEntity> data)
    {
        this.data = data;
    }

    public static class DataEntity
    {
        private String typeName;
        private String id;
        private int valid;
        private String validName;
        private int type;
        /**
         * id : e54910245143f903015146aa3ab6042c
         * createTime : 2015-11-27 09:59:00
         * name : 王军平
         * state : 正常
         * mobile : 13994228195
         * loginName : 13994228195
         */

        private UserEntity user;
        private String yiShengUserNum;
        /**
         * id : 00000010
         * school : {"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"}
         * keM : {"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"}
         * name : 44班
         * user : {"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"}
         */

        private BanJEntity banJ;

        public String getTypeName()
        {
            return typeName;
        }

        public void setTypeName(String typeName)
        {
            this.typeName = typeName;
        }

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public int getValid()
        {
            return valid;
        }

        public void setValid(int valid)
        {
            this.valid = valid;
        }

        public String getValidName()
        {
            return validName;
        }

        public void setValidName(String validName)
        {
            this.validName = validName;
        }

        public int getType()
        {
            return type;
        }

        public void setType(int type)
        {
            this.type = type;
        }

        public UserEntity getUser()
        {
            return user;
        }

        public void setUser(UserEntity user)
        {
            this.user = user;
        }

        public String getYiShengUserNum()
        {
            return yiShengUserNum;
        }

        public void setYiShengUserNum(String yiShengUserNum)
        {
            this.yiShengUserNum = yiShengUserNum;
        }

        public BanJEntity getBanJ()
        {
            return banJ;
        }

        public void setBanJ(BanJEntity banJ)
        {
            this.banJ = banJ;
        }

        public static class UserEntity
        {
            private String id;
            private String createTime;
            private String name;
            private String state;
            private String mobile;
            private String loginName;

            public String getId()
            {
                return id;
            }

            public void setId(String id)
            {
                this.id = id;
            }

            public String getCreateTime()
            {
                return createTime;
            }

            public void setCreateTime(String createTime)
            {
                this.createTime = createTime;
            }

            public String getName()
            {
                return name;
            }

            public void setName(String name)
            {
                this.name = name;
            }

            public String getState()
            {
                return state;
            }

            public void setState(String state)
            {
                this.state = state;
            }

            public String getMobile()
            {
                return mobile;
            }

            public void setMobile(String mobile)
            {
                this.mobile = mobile;
            }

            public String getLoginName()
            {
                return loginName;
            }

            public void setLoginName(String loginName)
            {
                this.loginName = loginName;
            }
        }

        public static class BanJEntity
        {
            private String id;
            /**
             * clime : {"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"}
             * id : 402881ed50943a980150945ef5640297
             * name : 太原市志达中学
             * orderId : 0
             * rcsField : name
             * rcsKey : 402881ed50943a980150945ef5640297
             * rcsValue : 太原市志达中学
             */

            private SchoolEntity school;
            /**
             * id : 2c90813a5074c128015074cb6707000b
             * name : 数学
             * orderId : 1
             * rcsField : name
             * rcsKey : 2c90813a5074c128015074cb6707000b
             * rcsValue : 数学
             */

            private KeMEntity keM;
            private String name;
            /**
             * id : e54910245143f903015146aa3ab6042c
             * createTime : 2015-11-27 09:59:00
             * name : 王军平
             * state : 正常
             * mobile : 13994228195
             * loginName : 13994228195
             */

            private UserEntity user;

            public String getId()
            {
                return id;
            }

            public void setId(String id)
            {
                this.id = id;
            }

            public SchoolEntity getSchool()
            {
                return school;
            }

            public void setSchool(SchoolEntity school)
            {
                this.school = school;
            }

            public KeMEntity getKeM()
            {
                return keM;
            }

            public void setKeM(KeMEntity keM)
            {
                this.keM = keM;
            }

            public String getName()
            {
                return name;
            }

            public void setName(String name)
            {
                this.name = name;
            }

            public UserEntity getUser()
            {
                return user;
            }

            public void setUser(UserEntity user)
            {
                this.user = user;
            }

            public static class SchoolEntity
            {
                /**
                 * climeName : 太原
                 * id : 2
                 * parentClime : {"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"}
                 * rcsField : climeName
                 * rcsKey : 2
                 * rcsParentField : parentClime
                 * rcsParentKey : 1
                 * rcsValue : 太原
                 */

                private ClimeEntity clime;
                private String id;
                private String name;
                private int orderId;
                private String rcsField;
                private String rcsKey;
                private String rcsValue;

                public ClimeEntity getClime()
                {
                    return clime;
                }

                public void setClime(ClimeEntity clime)
                {
                    this.clime = clime;
                }

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getName()
                {
                    return name;
                }

                public void setName(String name)
                {
                    this.name = name;
                }

                public int getOrderId()
                {
                    return orderId;
                }

                public void setOrderId(int orderId)
                {
                    this.orderId = orderId;
                }

                public String getRcsField()
                {
                    return rcsField;
                }

                public void setRcsField(String rcsField)
                {
                    this.rcsField = rcsField;
                }

                public String getRcsKey()
                {
                    return rcsKey;
                }

                public void setRcsKey(String rcsKey)
                {
                    this.rcsKey = rcsKey;
                }

                public String getRcsValue()
                {
                    return rcsValue;
                }

                public void setRcsValue(String rcsValue)
                {
                    this.rcsValue = rcsValue;
                }

                public static class ClimeEntity
                {
                    private String climeName;
                    private String id;
                    /**
                     * climeName : 忻州
                     * id : 1
                     * rcsField : climeName
                     * rcsKey : 1
                     * rcsParentField : parentClime
                     * rcsParentKey :
                     * rcsValue : 忻州
                     */

                    private ParentClimeEntity parentClime;
                    private String rcsField;
                    private String rcsKey;
                    private String rcsParentField;
                    private String rcsParentKey;
                    private String rcsValue;

                    public String getClimeName()
                    {
                        return climeName;
                    }

                    public void setClimeName(String climeName)
                    {
                        this.climeName = climeName;
                    }

                    public String getId()
                    {
                        return id;
                    }

                    public void setId(String id)
                    {
                        this.id = id;
                    }

                    public ParentClimeEntity getParentClime()
                    {
                        return parentClime;
                    }

                    public void setParentClime(ParentClimeEntity parentClime)
                    {
                        this.parentClime = parentClime;
                    }

                    public String getRcsField()
                    {
                        return rcsField;
                    }

                    public void setRcsField(String rcsField)
                    {
                        this.rcsField = rcsField;
                    }

                    public String getRcsKey()
                    {
                        return rcsKey;
                    }

                    public void setRcsKey(String rcsKey)
                    {
                        this.rcsKey = rcsKey;
                    }

                    public String getRcsParentField()
                    {
                        return rcsParentField;
                    }

                    public void setRcsParentField(String rcsParentField)
                    {
                        this.rcsParentField = rcsParentField;
                    }

                    public String getRcsParentKey()
                    {
                        return rcsParentKey;
                    }

                    public void setRcsParentKey(String rcsParentKey)
                    {
                        this.rcsParentKey = rcsParentKey;
                    }

                    public String getRcsValue()
                    {
                        return rcsValue;
                    }

                    public void setRcsValue(String rcsValue)
                    {
                        this.rcsValue = rcsValue;
                    }

                    public static class ParentClimeEntity
                    {
                        private String climeName;
                        private String id;
                        private String rcsField;
                        private String rcsKey;
                        private String rcsParentField;
                        private String rcsParentKey;
                        private String rcsValue;

                        public String getClimeName()
                        {
                            return climeName;
                        }

                        public void setClimeName(String climeName)
                        {
                            this.climeName = climeName;
                        }

                        public String getId()
                        {
                            return id;
                        }

                        public void setId(String id)
                        {
                            this.id = id;
                        }

                        public String getRcsField()
                        {
                            return rcsField;
                        }

                        public void setRcsField(String rcsField)
                        {
                            this.rcsField = rcsField;
                        }

                        public String getRcsKey()
                        {
                            return rcsKey;
                        }

                        public void setRcsKey(String rcsKey)
                        {
                            this.rcsKey = rcsKey;
                        }

                        public String getRcsParentField()
                        {
                            return rcsParentField;
                        }

                        public void setRcsParentField(String rcsParentField)
                        {
                            this.rcsParentField = rcsParentField;
                        }

                        public String getRcsParentKey()
                        {
                            return rcsParentKey;
                        }

                        public void setRcsParentKey(String rcsParentKey)
                        {
                            this.rcsParentKey = rcsParentKey;
                        }

                        public String getRcsValue()
                        {
                            return rcsValue;
                        }

                        public void setRcsValue(String rcsValue)
                        {
                            this.rcsValue = rcsValue;
                        }
                    }
                }
            }

            public static class KeMEntity
            {
                private String id;
                private String name;
                private int orderId;
                private String rcsField;
                private String rcsKey;
                private String rcsValue;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getName()
                {
                    return name;
                }

                public void setName(String name)
                {
                    this.name = name;
                }

                public int getOrderId()
                {
                    return orderId;
                }

                public void setOrderId(int orderId)
                {
                    this.orderId = orderId;
                }

                public String getRcsField()
                {
                    return rcsField;
                }

                public void setRcsField(String rcsField)
                {
                    this.rcsField = rcsField;
                }

                public String getRcsKey()
                {
                    return rcsKey;
                }

                public void setRcsKey(String rcsKey)
                {
                    this.rcsKey = rcsKey;
                }

                public String getRcsValue()
                {
                    return rcsValue;
                }

                public void setRcsValue(String rcsValue)
                {
                    this.rcsValue = rcsValue;
                }
            }

            public static class UserEntity
            {
                private String id;
                private String createTime;
                private String name;
                private String state;
                private String mobile;
                private String loginName;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getCreateTime()
                {
                    return createTime;
                }

                public void setCreateTime(String createTime)
                {
                    this.createTime = createTime;
                }

                public String getName()
                {
                    return name;
                }

                public void setName(String name)
                {
                    this.name = name;
                }

                public String getState()
                {
                    return state;
                }

                public void setState(String state)
                {
                    this.state = state;
                }

                public String getMobile()
                {
                    return mobile;
                }

                public void setMobile(String mobile)
                {
                    this.mobile = mobile;
                }

                public String getLoginName()
                {
                    return loginName;
                }

                public void setLoginName(String loginName)
                {
                    this.loginName = loginName;
                }
            }
        }
    }
}


