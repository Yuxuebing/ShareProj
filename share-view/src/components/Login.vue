<template>
  <div id="login">
      <el-form class="login-container" :model="loginForm" :rules="rules" status-icon label-position="left" label-width="0px" v-loading="loading">
        <h3 class="login_title">系统登录</h3>
        <el-form-item prop="username">
          <el-input type="text" v-model="loginForm.username" auto-complete="off" placeholder="用户名"></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input type="password" v-model="loginForm.password" auto-complete="off" placeholder="密码"></el-input>
        </el-form-item>
        <el-checkbox class="login_remember" v-model="checked" label-position="left"><span style="color: #505458">记住密码</span></el-checkbox>
        <el-form-item style="width: 100%">
          <el-button type="primary" style="width: 40%;background: #505458;border: none" v-on:click="login">登录</el-button>
        </el-form-item>
      </el-form>
  </div>
</template>

<script>
    export default {
        name: 'Login',
        data () {
          return {
            rules: {
              username: [{required: true, message: '用户名不能为空', trigger: 'blur'}],
              password: [{required: true, message: '密码不能为空', trigger: 'blur'}]
            },
            checked: true,
            loginForm: {
              username: '',
              password: ''
            },
            loading: false
          }
        },
        methods: {
          login () {
            this.$axios.post('/login', {
                  username: this.loginForm.username,
                  password: this.loginForm.password
                })
                .then(successResponse => {
                  if (successResponse.data.code === 200) {
                    this.$store.commit('login', this.loginForm)
                    this.$router.replace({path: '/admin'})
                  } else {
                    this.$router.replace({path: '/'})
                  }
                })
          }
        }
    }
</script>

<style scoped>
  #login {
    width: 100%;
    height: 100%;
    background: url("../assets/eva.jpg") no-repeat center;
    background-size: cover;
    position: fixed;
  }
  .login-container {
    border-radius: 15px;
    background-clip: padding-box;
    margin: 90px auto;
    width: 350px;
    padding: 35px 35px 15px 35px;
    background: #fff;
    border: 1px solid #eaeaea;
    box-shadow: 0 0 25px #cac6c6;
  }
  label.el-checkbox.login_remember {
    margin: 0px 0px 15px;
    text-align: left;
  }
</style>
