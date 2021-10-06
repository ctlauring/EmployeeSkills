import axios from 'axios';



export default{
    getEmployeeSkills(employeeId) {
        return axios.get(`/employees/${employeeId}/skills`)
    },

    deleteEmployee(employeeId) {
        return axios.delete(`/employees/${employeeId}`)
    },

     addSkill(skill,employeeId) {
         return axios.post(`/employees/${employeeId}/skills`,skill, {
            headers: {
              'content-type': 'application/json'
            }
          });
     },

     updateEmployee(employee) {
        return axios.put(`/employees/${employee.id}`,employee);
    }



}