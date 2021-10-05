<template>
  <div class="home">
    <h1>Employee Skills</h1>
    <employee-list />
    
    
    <router-view />
  </div>
</template>

<script>
import EmployeeList from "@/components/EmployeeList.vue";

export default {
  name: "home",
  components: { EmployeeList },
};
</script>


<style scoped>
div.home {
  text-align: center;
}
h1 {
  color: black;
}
</style>