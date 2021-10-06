<template>
  <div class="skills-list">
      <h2>Get an employee's skills</h2>
      <div class="form-holder">
              <input
                class="form-control"
                type="text"
                placeholder="Enter employee ID..."
                v-model="employeeId"
              />
      <p v-for="skill in allSkills" :key="skill.id">
          {{skill.id}} -- {{skill.experience}} -- {{skill.summary}}
      </p>
      <button
      @click.prevent="getEmployeeSkills"
      class="btn block-cube block-cube-hover"
      type="button"
    > Get employee's skills
    </button>
    </div>
  </div>    
</template>

<script>
import SkillsService from "@/services/SkillsService.js"
export default {
    name: "Skills-list",
    components: {},

    data() {
        return {
            allSkills: [],
            employeeId: ""
        }
    },

    methods: {
    getEmployeeSkills() {
        SkillsService.getEmployeeSkills(this.employeeId)
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