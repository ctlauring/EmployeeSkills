<template>
  <div class="employee-list">
      <h2>Employee List</h2>
      <p v-for="employee in allEmployees" :key="employee.id">
          {{employee.id}} -- {{employee.firstName}} -- {{employee.lastName}} -- {{employee.address}} -- {{employee.contactEmail}} -- {{employee.birthDate}}
          -- {{employee.role}} -- {{employee.businessUnit}}
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
import EmployeeService from "@/services/EmployeeService.js"
import axios from "axios"
export default {
    name: "employee-list",
    components: {},

    data() {
        return {
            allEmployees: []
        }
    },
    async mounted()
    {
        let result = await axios.get("http://localhost:8080/employees");
        console.warn(result.data.data)
        this.allEmployees=result.data.data
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