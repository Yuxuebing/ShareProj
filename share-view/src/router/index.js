import Vue from 'vue'
import Router from 'vue-router'
import Portal from '../components/Portal'
import Login from '../components/Login'
import Home from '../components/admin/Home'

Vue.use(Router)
export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'Portal',
      component: Portal,
      meta: {
        requireAuth: true,
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
        {
          path: '/sysuser',
          name: 'SysUser',
          component: () => import('../components/admin/sysuser/Index')
        }
      ]
    }
  ]
})
