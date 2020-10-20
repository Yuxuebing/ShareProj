<template>
    <i class="el-icon-switch-button" v-on:click="logout" style="float:right;font-size: 40px;color: #222;padding: 10px"></i>
</template>

<script>
    export default {
        name: "Logout",
        methods: {
            logout () {
                this.$axios.get('/logout').then(resp => {
                    if (resp.data.code === 200) {
                        // 前后端状态保持一致
                        this.$store.commit('logout')
                        this.$router.replace('/login')
                    }
                })
            }
        }
    }
</script>

<style scoped>
    .el-icon-switch-button {
        cursor: pointer;
        outline:0;
    }
</style>