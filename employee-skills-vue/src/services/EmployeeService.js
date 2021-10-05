import axios from 'axios';



export default{
    listEmployees() {
        return axios.get('/employees');
    },

    // retrieve(userID) {
    //     return axios.get(`/api/tournamentByUser/${userID}`);
    // },

    // get(tournamentID) {
    //     return axios.get(`/api/tournament/${tournamentID}`);
    // },

    // create(tournament) {
    //     return axios.post('/api/createTournament',tournament);
    // },

    // delete(id) {
    //     return axios.delete(`/api/removeTournament/${id}`);
    // },
    // getList(searchText) {
    //     return axios.get(`/api/tournamentBySearch/${searchText}`);
    // },
    // getUsers() {
    //     return axios.get('/api/getUsers')
    // },
    // sendInvites(senderID, selectedUserIDs, tournamentID){
    //     return axios.post(`/api/createInvites/${senderID}/${tournamentID}`, selectedUserIDs)
    // },
    // getInvites(userID){
    //     return axios.get(`/api/receivedInvites/${userID}`)
    // },
    // acceptInvite(inviteID){
    //     return axios.put(`/api/acceptInvite/${inviteID}`)
    // },
    // rejectInvite(inviteID){
    //     return axios.put(`/api/rejectInvite/${inviteID}`)
    // },
    // addUserToTournament(userID, tournamentID){
    //     return axios.post(`/api/addUserToTournament/${userID}/${tournamentID}`)
    // },
    // getUser(userID){
    //     return axios.get(`/api/getUser/${userID}`)
    // },
    // getTournamentUsers(tournamentID){
    //     return axios.get(`/api/usersInTournament/${tournamentID}`)
    // },
    // getTournamentWinners(tournamentID){
    //     return axios.get(`/api/getTournamentWinners/${tournamentID}`)
    // },
    // assignWinners(tournamentID, winners){
    //     return axios.put(`/api/assignWinners/${tournamentID}`, winners)
    // }


}