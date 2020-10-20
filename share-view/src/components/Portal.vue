<template>
  <el-container>
    <el-header>
      <Header/>
    </el-header>
    <el-main>
      <Body/>
    </el-main>
    <el-footer>
      <Footer/>
    </el-footer>
  </el-container>
</template>

<script>
  import Header from 'components/portal/Header'
  import Body from 'components/portal/Body'
  import Footer from 'components/portal/Footer'
  export default {
    name: 'Portal',
    components: {Header, Body, Footer},
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }
  ul {
    list-style-type: none;
    padding: 0;
  }
  li {
    display: inline-block;
    margin: 0 10px;
  }
  a {
    color: #42b983;
  }
</style>
