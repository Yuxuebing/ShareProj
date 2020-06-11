<template>
  <el-container>
    <el-header>
      <Header></Header>
    </el-header>
    <el-container>
      <el-aside width="200px">
        <Aside></Aside>
      </el-aside>
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
    },
    mounted: function () {
      let user = sessionStorage.getItem('user')
      if (user) {
        this.username = user
      }
    }
  }
</script>

<style>
  .el-container {
    position: absolute;
    width: 100%;
    top: 0px;
    left: 0;
    bottom: 0;
  }

  .el-header .el-menu {
    border-bottom: none;
  }

  .el-aside, .el-main {
    padding-top: 60px;
  }

  .el-aside, .el-header {
    background: #545c64;
  }

  .el-aside .el-menu {
    border-right: none;
  }
  .el-header {
    padding: 0;
    z-index: 1000;
  }

  .el-header .fr {
    float: right;
  }
</style>
