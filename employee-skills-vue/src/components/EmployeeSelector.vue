<template>
  <div class="employee-selector">
      <div class="search-bar">
          <h2>Get an employee</h2>
            <div class="form-holder">
              <input
                class="form-control"
                type="text"
                placeholder="Enter employee ID..."
                v-model="employeeId"
              />
               <button
                @click.prevent="getEmployee"
                class="btn block-cube block-cube-hover"
                type="button"
                > Get employee by ID
               </button>
              </div>
        </div>    
  </div>    
</template>

<script>
import EmployeeService from "@/services/EmployeeService.js"

export default {
    name: "employee-list",
    components: {},

    data() {
        return {
            employee: [],
            employeeId: "",
        }
    },

    methods: {
    getEmployee() {
        EmployeeService.getEmployee(this.employeeId)
        .then((employeeData) => {
            console.log(employeeData)
            this.employee = employeeData.data;
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