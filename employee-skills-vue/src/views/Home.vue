<template>
  <div class="home">
    <h1>Employee Skills Application</h1>
    <employee-list />
    <employee-selector />
    
    
    <router-view />
  </div>
</template>

<script>
import EmployeeList from "@/components/EmployeeList.vue";
import EmployeeSelector from "@/components/EmployeeSelector.vue"

export default {
  name: "home",
  components: { EmployeeList, EmployeeSelector },
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