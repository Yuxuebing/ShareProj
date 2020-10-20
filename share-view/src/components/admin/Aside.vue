<template>
  <!--左侧导航-->
  <div>
    <div class="app-side-logo">
      <img src="@/assets/logo.png" height="60px" />
    </div>
    <el-menu :default-active="currentPath" class="el-menu-vertical-demo"
             background-color="#545c64"
             text-color="#fff"
             active-text-color="#ffd04b" :collapse="collapse" :collapse-transition="true">
      <el-submenu v-for="item in adminMenus" :key="item.id" :index="item.id">
        <template slot="title">
          <i :class="item.icon"></i>
          <span>{{item.name}}</span>
        </template>
        <el-menu-item-group v-for="child in item.children" class="over-hide" :key="child.url">
        <el-menu-item  :index="child.url">
          <i :class="child.icon"></i>
          <span>{{child.name}}</span>
        </el-menu-item>
        </el-menu-item-group>
      </el-submenu>
    </el-menu>
  </div>
</template>

<script>
  export default {
    name: 'Aside',
    props: ['collapse'],
    computed: {
      adminMenus () {
        return this.$store.state.adminMenus
      },
      currentPath () {
        return this.$route.path
      }
    },
    create: {

    }
  }
</script>

<style scoped>
  .el-menu-vertical-demo:not(.el-menu--collapse) {
    width: 200px;
  }
</style>
