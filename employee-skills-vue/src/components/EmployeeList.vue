<template>
  <div class="employee-list">
      <h1>Employee List</h1>
      <button
      @click.prevent="listEmployees"
      class="btn block-cube block-cube-hover"
      type="button"
    > call api
    </button>
  </div>    
</template>

<script>
import EmployeeService from "@/services/EmployeeService.js"
export default {
    name: "employee-list",
    components: {},

    data() {
        return {
            allEmployees: []
        }
    },

    created() {
        EmployeeService.listEmployees()
        .then((employeeData) => {
            console.log(employeeData)
            this.allEmployees = employeeData.data;
        })
        .catch((err) =>{
            console.error(err)
        })
    },

    methods: {
    listEmployees() {
        EmployeeService.listEmployees()
        .then((employeeData) => {
            console.log(employeeData)
            this.allEmployees = employeeData.data;
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