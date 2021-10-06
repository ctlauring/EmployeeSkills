<template>
  <div class="main" id="app">
      <div id="nav">
        <home></home>
      </div>
    <router-view />
  </div>
</template>

<script>

export default {
  components: { }
};

</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
