<template>
  <div class="skills-list">
      <h2>Add a skill to an employee</h2>
      <div class="form-holder">
              <input
                class="form-control"
                type="text"
                placeholder="Enter employee ID..."
                v-model="employeeId"
              />
              <input
                    v-model="skill.field.name"
                    name="name"
                    placeholder="Field name"
                    type="text"
                    required
                />
                <input
                    v-model="skill.field.type"
                    name="type"
                    placeholder="Field type"
                    type="text"
                    required
                />
            <input
                    v-model="skill.experience"
                    name="experience"
                    placeholder="Months of experience"
                    type="text"
                    required
                />
            <input
                    v-model="skill.summary"
                    name="summary"
                    placeholder="Skill summary"
                    type="text"
                    required
                />
      <button
      @click.prevent="addSkill"
      class="btn block-cube block-cube-hover"
      type="button"
    > Add skill
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
            skill: {
                field: {name: "", type: ""},
                experience: "",
                summary: ""
            },
            employeeId: ""
        }
    },

    methods: {
    addSkill() {
        SkillsService.addSkill(this.employeeId, this.skill)
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