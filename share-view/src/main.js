import Vue from 'vue'
import router from './router'
// 导入ElementUI
import ElementUI from 'element-ui'
import '@/styles/index.scss'
import 'element-ui/lib/theme-chalk/index.css'
import Index from './Index.vue'

const axios = require('axios')
axios.defaults.baseURL = 'http://localhost:8081/api'
// 使请求带上凭证信息
axios.defaults.withCredentials = true

Vue.prototype.$axios = axios
Vue.config.productionTip = false
// 使用ElementUI
Vue.use(ElementUI)

router.beforeEach((to, from, next) => {
  /* 路由发生变化修改页面title */
  if (to.meta.title) {
    document.title = to.meta.title
  }
  next()
})

new Vue({
  el: '#app',
  router,
  render: h => h(Index),
})
