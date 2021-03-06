import axios from 'axios';



export default{
    listEmployees() {
        return axios.get('/employees');
    },

    getEmployee(employeeId) {
        return axios.get(`/employees/${employeeId}`)
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