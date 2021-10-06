<template>
  <div class="employee-delete">
      <div class="search-bar">
          <h2>Delete an employee</h2>
            <div class="form-holder">
              <input
                class="form-control"
                type="text"
                placeholder="Enter employee ID..."
                v-model="employeeId"
              />
               <button
                @click.prevent="deleteEmployee"
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
    name: "employee-delete",
    components: {},

    data() {
        return {
            employee: [],
            employeeId: "",
        }
    },

    methods: {
    deleteEmployee() {
        EmployeeService.deleteEmployee(this.employeeId)
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