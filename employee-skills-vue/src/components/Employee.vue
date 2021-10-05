<template>
  <div>
      <h1 class="employee-name">{{employee.employeeFirstName}}</h1>
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