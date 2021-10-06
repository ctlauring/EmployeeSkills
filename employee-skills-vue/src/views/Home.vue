<template>
  <div class="home">
    <h1>Employee Skills Application</h1>
    <employee-list />
    <employee-selector />
    <employee-delete  />
    <employee-post />
    <employee-put />
    <skills-list />
    <skill-post />
    
    
    <router-view />
  </div>
</template>

<script>
import EmployeeList from "@/components/EmployeeList.vue";
import EmployeeSelector from "@/components/EmployeeSelector.vue"
import EmployeeDelete from "@/components/EmployeeDelete.vue"
import EmployeePost from "@/components/EmployeePost.vue"
import EmployeePut from "@/components/EmployeePut.vue"
import SkillsList from '@/components/SkillsList.vue';
import SkillPost from '@/components/SkillPost.vue';


export default {
  name: "home",
  components: { EmployeeList, EmployeeSelector, EmployeeDelete, EmployeePost, EmployeePut, SkillsList, SkillPost },
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