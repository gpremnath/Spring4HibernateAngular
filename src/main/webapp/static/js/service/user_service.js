/**
 * Created by totient on 23/3/16.
 */
'use strict';

App.factory('UserService', ['$http', '$q', function($http, $q){

    return {

        fetchAllUsers: function() {
            return $http.get('https://localhost:8443/Spring4HibernateAngular/user/')
                .then(
                function(response){
                    return response.data;
                },
                function(errResponse){
                    console.error('Error while fetching users');
                    return $q.reject(errResponse);
                }
            );
        },

        createUser: function(user){
            return $http.post('https://localhost:8443/Spring4HibernateAngular/user/', user)
                .then(
                function(response){
                    return response.data;
                },
                function(errResponse){
                    console.error('Error while creating user');
                    return $q.reject(errResponse);
                }
            );
        },

        updateUser: function(user, id){
            return $http.put('https://localhost:8443/Spring4HibernateAngular/user/'+id, user)
                .then(
                function(response){
                    return response.data;
                },
                function(errResponse){
                    console.error('Error while updating user');
                    return $q.reject(errResponse);
                }
            );
        },

        deleteUser: function(id){
            return $http.delete('https://localhost:8443/Spring4HibernateAngular/user/'+id)
                .then(
                function(response){
                    return response.data;
                },
                function(errResponse){
                    console.error('Error while deleting user');
                    return $q.reject(errResponse);
                }
            );
        }

    };

}]);