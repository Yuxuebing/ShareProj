<template>
    <el-container>
      <!--左侧导航-->
      <el-aside class="app-side app-side-left"
                :class="isCollapse ? 'app-side-collapsed' : 'app-side-expanded'">
        <div class="app-side-logo">
          <img src="@/assets/logo.png"
               :width="isCollapse ? '60' : '60'"
               height="60" />
        </div>
        <div>
          <el-menu default-active="1-4-1"
                   class="el-menu-vertical-demo"
                   @open="handleOpen"
                   :collapse="isCollapse">

          <!--左侧项目-->
            <el-submenu index="1">
              <template slot="title">
                <i class="el-icon-location"></i>
                <span slot="title">导航一</span>
              </template>
              <el-menu-item-group>
                <span slot="title">分组一</span>
                <el-menu-item index="1-1">选项1</el-menu-item>
                <el-menu-item index="1-2">选项2</el-menu-item>
              </el-menu-item-group>
              <el-menu-item-group title="分组2">
                <el-menu-item index="1-3">选项3</el-menu-item>
              </el-menu-item-group>
              <el-submenu index="1-4">
                <span slot="title">选项4</span>
                <el-menu-item index="1-4-1">选项1</el-menu-item>
              </el-submenu>
            </el-submenu>
            <el-menu-item index="2">
              <i class="el-icon-menu"></i>
              <span slot="title">导航二</span>
            </el-menu-item>
            <el-menu-item index="3" disabled>
              <i class="el-icon-document"></i>
              <span slot="title">导航三</span>
            </el-menu-item>
            <el-menu-item index="4">
              <i class="el-icon-setting"></i>
              <span slot="title">导航四</span>
            </el-menu-item>
          </el-menu>
        </div>
      </el-aside>
      <!--右侧主内容-->
      <el-container>
        <!--头部-->
        <el-header class="app-header">
          <div style="cursor: pointer"
               @click.prevent="toggleSideBar">
            <i v-show="!isCollapse" class="el-icon-d-arrow-left"></i>
            <i v-show="isCollapse" class="el-icon-d-arrow-right"></i>
          </div>

          <div class="app-header-userinfo">
            <el-dropdown trigger="hover"
                         :hide-on-click="false">
              <span class="el-dropdown-link">
                {{ username }}
                <i class="el-icon-arrow-down el-icon--right"></i>
              </span>
              <el-dropdown-menu slot="dropdown">
                <el-dropdown-item>
                  <a href="/">首页</a>
                </el-dropdown-item>
                <el-dropdown-item>
                  <a v-on:click="modifyPassword">修改密码</a>
                </el-dropdown-item>
                <el-dropdown-item divided
                                  @click.native="logout">
                  退出登录
                </el-dropdown-item>
              </el-dropdown-menu>
            </el-dropdown>
          </div>
        </el-header>
        <!--显示窗口-->
        <el-main>
          <router-view/>
        </el-main>
      </el-container>
    </el-container>
</template>

<script>
    export default {
        name: 'Home',
        data() {
          return {
            username: '管理员',
            isCollapse: false
          }
        },
        methods: {
          toggleSideBar() {
            this.isCollapse = !this.isCollapse
          },
          logout: function () {
            this.$confirm('确认退出?', '提示', {})
              .then(() => {
                sessionStorage.removeItem('user')
                this.$router.push('/login')
              })
              .catch(() => { })
          },
          handleOpen(key, keyPath) {
            console.log(key, keyPath)
          },
          handleClose(key, keyPath) {
            console.log(key, keyPath)
          },
          handleSelect(key, keyPath) {
            console.log(key, keyPath)
          },
          modifyPassword: function() {

          }
        },
        mounted: function () {
          let user = sessionStorage.getItem('user')
          if (user) {
            this.username = user
          }
        }
    }
</script>

<style scoped>

</style>
