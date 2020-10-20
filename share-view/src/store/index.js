import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        user: {
            username: window.localStorage.getItem('user' || '[]') == null ? '' : JSON.parse(window.localStorage.getItem('user' || '[]')).username
        },
        adminMenus: [{
            "id":1,
            "name":"系统管理",
            "icon":"el-icon-setting",
            "parentId":0,
            "url":"#",
            "children":[{
                "id":2,
                "name":"用户管理",
                "icon":"el-icon-menu",
                "parentId":1,
                "url":"/admin/sysuser"
            },{
                "id":3,
                "name":"角色管理",
                "icon":"el-icon-menu",
                "parentId":1,
                "url":"#"
            }]
        },{
            "id":4,
            "name":"内容管理",
            "icon":"el-icon-menu",
            "parentId":0,
            "url":"#"
        }]
    },
    mutations: {
        login (state, user) {
            state.user = user
            window.localStorage.setItem('user', JSON.stringify(user))
        },
        logout (state) {
            state.user = []
            window.localStorage.removeItem('user')
            state.adminMenus = []
        }
    }
})