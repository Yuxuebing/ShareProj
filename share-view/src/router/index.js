import Vue from 'vue'
import Router from 'vue-router'
import Portal from '@/components/Portal'
import Login from '@/components/Login'
import Home from '@/components/admin/Home'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Portal',
      component: Portal,
      meta: {
        title: 'Welcome to Share'
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
      path: '/admin',
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
