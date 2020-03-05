<template>
    <el-container class='wrap'>
      <!--左侧导航-->
      <el-aside>
        <el-menu :default-openeds="['1', '2']"
        :default-active="this.$route.path"
        :router="true"
        background-color="rgba(52, 64, 88)"
        text-color="white">

        <!--左侧项目-->
        <el-submenu index="1" >
          <template slot="title"><i class="el-icon-message"></i>项目</template>
          <el-menu-item-group>
            <el-menu-item index="/home/unfinish">进行中</el-menu-item>
            <el-menu-item index="/home/finish">已完成</el-menu-item>
            <el-menu-item index="/home/create">创建项目</el-menu-item>
            <el-menu-item index="/home/search">搜索</el-menu-item>
          </el-menu-item-group>
        </el-submenu>
        </el-menu>
      </el-aside>
      <!--右侧主内容-->
      <el-container>
        <!--头部-->
        <el-header></el-header>
        <!--显示窗口-->
        <el-main>
          <router-view/>
        </el-main>
      </el-container>
    </el-container>
</template>

<script>
    export default {
        name: 'Home'
    }
</script>

<style scoped>

</style>
