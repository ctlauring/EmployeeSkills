<template>
  <div class="employee-list">
      <h2>Get an employee's skills</h2>
      <div class="form-holder">
              <input
                class="form-control"
                type="text"
                placeholder="Enter employee ID..."
                v-model="employeeId"
              />
      <p v-for="skill in allSkills" :key="skill.id">
          {{skill.id}} -- {{skills.field.name}} -- {{skills.experience}} -- {{skills.summary}}
      </p>
      <button
      @click.prevent="listEmployees"
      class="btn block-cube block-cube-hover"
      type="button"
    > Get all employees
    </button>
  </div>    
</template>

<script>
import SkillsService from "@/services/SkillsService.js"
export default {
    name: "SKills-list",
    components: {},

    data() {
        return {
            allSkills: [],
            employeeId: ""
        }
    },

    methods: {
    getEmployeeSkill() {
        SkillsService.getEmployeeSkill(employeeId)
        .then((skillsData) => {
            console.log(skillsData)
            this.allSkills = skillsData.data;
        })
        .catch((err) =>{
            console.error(err)
        })
    }
    }
}
</script>

<style>

</style>