<template>
  <div class="employee-put">
      <div class="employee-form">
          <h2>Add an employee</h2>
            <div class="form-holder">
                <input
                    v-model="employee.firstName"
                    name="firstName"
                    placeholder="First Name"
                    type="text"
                    required
                />
                <input
                    v-model="employee.lastName"
                    name="lastName"
                    placeholder="Last Name"
                    type="text"
                    required
                />
                        <input
                            v-model="employee.address.street"
                            name="street"
                            placeholder="Street"
                            type="text"
                            required
                        />
                        <input
                            v-model="employee.address.suite"
                            name="suite"
                            placeholder="Suite"
                            type="text"
                            required
                        />
                        <input
                            v-model="employee.address.city"
                            name="city"
                            placeholder= "City"
                            type="text"
                            required
                        />
                        <input
                            v-model="employee.address.region"
                            name="sregion"
                            placeholder="Region"
                            type="text"
                            required
                        />
                        <input
                            v-model="employee.address.postal"
                            name="postal"
                            placeholder="Postal Code"
                            type="text"
                            required
                        />
                        <input
                            v-model="employee.address.country"
                            name="country"
                            placeholder="Country"
                            type="text"
                            required
                        />
                <input
                    v-model="employee.contactEmail"
                    name="contactEmail"
                    placeholder="Contact email"
                    type="text"
                    required
                />
                <input
                    v-model="employee.birthDate"
                    name="birthDate"
                    placeholder="birthDate"
                    type="text"
                    required
                />
                <input
                    v-model="employee.hiredDate"
                    name="hiredDate"
                    placeholder="Hired Date"
                    type="text"
                    required
                />
                <input
                    v-model="employee.role"
                    name="role"
                    placeholder="Role"
                    type="text"
                    required
                />
                <input
                    v-model="employee.businessUnit"
                    name="businessUnit"
                    placeholder="Business Unit"
                    type="text"
                    required
                />
               <button
                @click.prevent="createEmployee"
                class="btn block-cube block-cube-hover"
                type="button"
                > Add Employee
               </button>
              </div>
        </div>    
  </div>    
</template>

<script>
import EmployeeService from "@/services/EmployeeService.js"

export default {
    name: "employee-post",
    components: {},

    data() {
        return {
            employee: {
                firstName: "",
                lastName: "",
                address: {street: "", suite: "", city: "", region: "", postal: "", country: ""},
                contactEmail: "",
                birthDate: "",
                hiredDate: "",
                role: "",
                businessUnit: "",
            },

        }
    },

    methods: {
    createEmployee() {
        EmployeeService.createEmployee(this.employee)
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