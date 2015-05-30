(function() {
    var app = angular.module('tasklist', [ ]);

    app.controller('TasksController',
                   function ($scope, $http) {
                       var that = this
                       
                       this.tasks = [];

                       function refresh() {
                           $http.get('services/rest/TaskList/jarda')
                               .success(function (response) {
                                   that.tasks = response.tasks
                                   document.getElementById("new-task-text").value = "new task"
                                   
                               })
                       }


                       this.editTask = function(id) {
                           var text = document.getElementById("task-text-" + id).value
                           
                           $http.post('services/rest/TaskList/put', {task:{id: id, text: text, taskList:'jarda'}} )
                               .success(function (response) { refresh() })
                       }

                       this.deleteTask = function(id) {
                           $http.post('services/rest/TaskList/del', { task:{id: id} })
                               .success(function (response) { refresh() })
                       }                       

                       this.newTask = function() {
                           var text = document.getElementById("new-task-text").value
                           
                           $http.post('services/rest/TaskList/new', {task:{text:text, taskList:'jarda'}})
                               .success(function (response) { refresh() })
                       }
                       
                       refresh()
                   });

})();
