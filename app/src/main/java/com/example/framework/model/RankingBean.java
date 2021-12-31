package com.example.framework.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: JianTours
 * @Data: 2021/12/31 21:48
 * @Description: 排行榜
 */
public class RankingBean implements Serializable {

    /**
     * data : {"curPage":1,"datas":[{"coinCount":60958,"level":610,"nickname":"","rank":"1","userId":20382,"username":"g**eii"},{"coinCount":59480,"level":595,"nickname":"","rank":"2","userId":29303,"username":"深**士"},{"coinCount":44308,"level":444,"nickname":"","rank":"3","userId":2,"username":"x**oyang"},{"coinCount":32176,"level":322,"nickname":"","rank":"4","userId":3559,"username":"A**ilEyon"},{"coinCount":31488,"level":315,"nickname":"","rank":"5","userId":7809,"username":"1**23822235"},{"coinCount":31435,"level":315,"nickname":"","rank":"6","userId":14829,"username":"l**changwen"},{"coinCount":30858,"level":309,"nickname":"","rank":"7","userId":7891,"username":"h**zkp"},{"coinCount":30487,"level":305,"nickname":"","rank":"8","userId":7710,"username":"i**Cola7"},{"coinCount":30183,"level":302,"nickname":"","rank":"9","userId":4886,"username":"z**iyun"},{"coinCount":30060,"level":301,"nickname":"","rank":"10","userId":26707,"username":"p**xc.com"},{"coinCount":29404,"level":295,"nickname":"","rank":"11","userId":2068,"username":"i**Cola"},{"coinCount":29112,"level":292,"nickname":"","rank":"12","userId":12351,"username":"w**igeny"},{"coinCount":28942,"level":290,"nickname":"","rank":"13","userId":29390,"username":"L**ing"},{"coinCount":28681,"level":287,"nickname":"","rank":"14","userId":7590,"username":"陈**啦啦啦"},{"coinCount":28620,"level":287,"nickname":"","rank":"15","userId":28457,"username":"w**dla"},{"coinCount":28573,"level":286,"nickname":"","rank":"16","userId":833,"username":"w**lwaywang6"},{"coinCount":28357,"level":284,"nickname":"","rank":"17","userId":1534,"username":"j**gbin"},{"coinCount":28211,"level":283,"nickname":"","rank":"18","userId":25128,"username":"f**wandroid"},{"coinCount":28210,"level":283,"nickname":"","rank":"19","userId":25419,"username":"蔡**打篮球"},{"coinCount":28158,"level":282,"nickname":"","rank":"20","userId":3825,"username":"请**娃哈哈"},{"coinCount":27375,"level":274,"nickname":"","rank":"21","userId":2160,"username":"R**iner"},{"coinCount":26394,"level":264,"nickname":"","rank":"22","userId":14839,"username":"x**y_sjc"},{"coinCount":25878,"level":259,"nickname":"","rank":"23","userId":29185,"username":"轻**宇"},{"coinCount":25858,"level":259,"nickname":"","rank":"24","userId":25793,"username":"F**_2014"},{"coinCount":25021,"level":251,"nickname":"","rank":"25","userId":2657,"username":"a**111993@163.com"},{"coinCount":24808,"level":249,"nickname":"","rank":"26","userId":29398,"username":"l**bwstory"},{"coinCount":24633,"level":247,"nickname":"","rank":"27","userId":42260,"username":"C**nY"},{"coinCount":24434,"level":245,"nickname":"","rank":"28","userId":1580,"username":"k**od21"},{"coinCount":24434,"level":245,"nickname":"","rank":"29","userId":20592,"username":"c**hao9808"},{"coinCount":24335,"level":244,"nickname":"","rank":"30","userId":13273,"username":"1**17315362"}],"offset":0,"over":false,"pageCount":3219,"size":30,"total":96541}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean implements Serializable {
        /**
         * curPage : 1
         * datas : [{"coinCount":60958,"level":610,"nickname":"","rank":"1","userId":20382,"username":"g**eii"},{"coinCount":59480,"level":595,"nickname":"","rank":"2","userId":29303,"username":"深**士"},{"coinCount":44308,"level":444,"nickname":"","rank":"3","userId":2,"username":"x**oyang"},{"coinCount":32176,"level":322,"nickname":"","rank":"4","userId":3559,"username":"A**ilEyon"},{"coinCount":31488,"level":315,"nickname":"","rank":"5","userId":7809,"username":"1**23822235"},{"coinCount":31435,"level":315,"nickname":"","rank":"6","userId":14829,"username":"l**changwen"},{"coinCount":30858,"level":309,"nickname":"","rank":"7","userId":7891,"username":"h**zkp"},{"coinCount":30487,"level":305,"nickname":"","rank":"8","userId":7710,"username":"i**Cola7"},{"coinCount":30183,"level":302,"nickname":"","rank":"9","userId":4886,"username":"z**iyun"},{"coinCount":30060,"level":301,"nickname":"","rank":"10","userId":26707,"username":"p**xc.com"},{"coinCount":29404,"level":295,"nickname":"","rank":"11","userId":2068,"username":"i**Cola"},{"coinCount":29112,"level":292,"nickname":"","rank":"12","userId":12351,"username":"w**igeny"},{"coinCount":28942,"level":290,"nickname":"","rank":"13","userId":29390,"username":"L**ing"},{"coinCount":28681,"level":287,"nickname":"","rank":"14","userId":7590,"username":"陈**啦啦啦"},{"coinCount":28620,"level":287,"nickname":"","rank":"15","userId":28457,"username":"w**dla"},{"coinCount":28573,"level":286,"nickname":"","rank":"16","userId":833,"username":"w**lwaywang6"},{"coinCount":28357,"level":284,"nickname":"","rank":"17","userId":1534,"username":"j**gbin"},{"coinCount":28211,"level":283,"nickname":"","rank":"18","userId":25128,"username":"f**wandroid"},{"coinCount":28210,"level":283,"nickname":"","rank":"19","userId":25419,"username":"蔡**打篮球"},{"coinCount":28158,"level":282,"nickname":"","rank":"20","userId":3825,"username":"请**娃哈哈"},{"coinCount":27375,"level":274,"nickname":"","rank":"21","userId":2160,"username":"R**iner"},{"coinCount":26394,"level":264,"nickname":"","rank":"22","userId":14839,"username":"x**y_sjc"},{"coinCount":25878,"level":259,"nickname":"","rank":"23","userId":29185,"username":"轻**宇"},{"coinCount":25858,"level":259,"nickname":"","rank":"24","userId":25793,"username":"F**_2014"},{"coinCount":25021,"level":251,"nickname":"","rank":"25","userId":2657,"username":"a**111993@163.com"},{"coinCount":24808,"level":249,"nickname":"","rank":"26","userId":29398,"username":"l**bwstory"},{"coinCount":24633,"level":247,"nickname":"","rank":"27","userId":42260,"username":"C**nY"},{"coinCount":24434,"level":245,"nickname":"","rank":"28","userId":1580,"username":"k**od21"},{"coinCount":24434,"level":245,"nickname":"","rank":"29","userId":20592,"username":"c**hao9808"},{"coinCount":24335,"level":244,"nickname":"","rank":"30","userId":13273,"username":"1**17315362"}]
         * offset : 0
         * over : false
         * pageCount : 3219
         * size : 30
         * total : 96541
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean implements Serializable {
            /**
             * coinCount : 60958
             * level : 610
             * nickname :
             * rank : 1
             * userId : 20382
             * username : g**eii
             */

            private int coinCount;
            private int level;
            private String nickname;
            private String rank;
            private int userId;
            private String username;

            public int getCoinCount() {
                return coinCount;
            }

            public void setCoinCount(int coinCount) {
                this.coinCount = coinCount;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }
        }
    }
}
