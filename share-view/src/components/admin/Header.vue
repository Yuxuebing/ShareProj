<template>
    <el-menu
      :default-active="1"
      class="el-menu-demo fr"
      mode="horizontal"
      background-color="#545c64"
      text-color="#fff"
      active-text-color="#ffd04b">
      <el-menu-item index="1">消息中心</el-menu-item>
      <el-submenu index="2">
        <template slot="title">我的工作台</template>
        <el-menu-item index="2-1">选项1</el-menu-item>
        <el-menu-item index="2-2">选项2</el-menu-item>
        <el-menu-item index="2-3">选项3</el-menu-item>
      </el-submenu>
      <el-menu-item index="3"><Logout/></el-menu-item>
    </el-menu>
</template>

<script>
    import Logout from "../Logout";
    export default {
        name: 'Header',
        components: {Logout}
    }
</script>

<style scoped>

</style>
