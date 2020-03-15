import Vue from 'vue'
import Router from 'vue-router'
import Portal from '@/components/Portal'
import Login from '@/components/Login'
import Home from '@/components/home/Home'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Portal',
      component: Portal,
      meta: {
        title: '首页'
      }
    },
    {
      path: '/login',
      name: 'Login',
      component: Login,
      meta: {
        title: '登录'
      }
    },
    {
      path: '/home',
      name: 'Home',
      component: Home,
      meta: {
        title: '主页'
      },
      children: [

      ]
    }
  ]
})
