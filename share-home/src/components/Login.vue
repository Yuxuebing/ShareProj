<template>
  <div id="login">
    <p>input 元素：</p>
    <input v-model="message" placeholder="编辑我……">
    <p>消息是: {{ message }}</p>
    <router-link to="/">Go to Bar</router-link>
    <router-link to="/home">Go to Home</router-link>
  </div>
</template>

<script>
    export default {
        name: 'Login',
        data () {
          return {
            message: ''
          }
        }
    }
</script>

<style scoped>

</style>
