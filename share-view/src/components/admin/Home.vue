<template>
  <el-container>
    <el-aside class="app-side app-side-left" width="initial">
      <Aside :collapse="collapse"></Aside>
    </el-aside>
    <el-container>
      <el-header>
        <div style="cursor: pointer; display: inline; line-height: 60px; float: left; color: white" @click.prevent="toggleSideBar">
          <i v-show="!collapse" class="el-icon-d-arrow-left"></i>
          <i v-show="collapse" class="el-icon-d-arrow-right"></i>
        </div>
        <Header></Header>
      </el-header>
      <el-main>Main</el-main>
    </el-container>
  </el-container>
</template>

<script>
  import Aside from '@/components/admin/Aside';
  import Header from '@/components/admin/Header';
  export default {
    name: 'Home',
    components: {Header, Aside},
    data() {
      return {
        username: '管理员',
        collapse: false
      }
    },
    methods: {
      toggleSideBar() {
        this.collapse = !this.collapse
      },
      logout: function () {
        this.$confirm('确认退出?', '提示', {})
          .then(() => {
            sessionStorage.removeItem('user')
            this.$router.push('/login')
          })
          .catch(() => {
          })
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
      modifyPassword: function () {

      }
    }
  }
</script>

<style>
  .el-container {position: absolute; width: 100%; top: 0px; left: 0; bottom: 0;}
  .el-container>.el-container{position: relative}
  .el-header .el-menu {border-bottom: none;}
  .el-aside, .el-header {background: #545c64;}
  .el-aside .el-menu {border-right: none;}
  .el-header {padding: 0; z-index: 1000;}
  .el-header .fr {float: right; line-height: 60px;}
</style>
