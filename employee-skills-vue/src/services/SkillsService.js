import axios from 'axios';



export default{
    getEmployeeSkills(employeeId) {
        return axios.get(`/employees/${employeeId}/skills`)
    },

    deleteEmployee(employeeId) {
        return axios.delete(`/employees/${employeeId}`)
    },

     createEmployee(employee) {
         return axios.post('/employees',employee);
     },

     updateEmployee(employee) {
        return axios.put(`/employees/${employee.id}`,employee);
    }



}