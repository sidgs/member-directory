'use strict';

App.controller('MemberController', ['$scope', 'Member', function($scope, Member) {
          var self = this;
          self.member= new Member();
          
          self.members=[];
              
          self.fetchAllMembers = function(){
        	  self.members = User.query();
          };
           
          self.createMember = function(){
        	  self.member.$save(function(){
        		  self.fetchAllMembers();
        	  });
          };

          self.updateMember = function(){
        	  self.member.$update(function(){
    			  self.fetchAllMembers();
    		  });
          };

         self.deleteMember = function(identity){
        	 var member = Member.get({id:identity}, function() {
        		  member.$delete(function(){
        			  console.log('Deleting member with id ', identity);
        			  self.fetchAllMembers();
        		  });
        	 });
          };

          self.fetchAllMembers();

          self.submit = function() {
              if(self.member.id==null){
                  console.log('Saving New Member', self.member);    
                  self.createMember();
              }else{
    			  console.log('Updating member with id ', self.member.id);
                  self.updateMember();
                  console.log('Member updated with id ', self.member.id);
              }
              self.reset();
          };
              
          self.edit = function(id){
              console.log('id to be edited', id);
              for(var i = 0; i < self.members.length; i++){
                  if(self.members[i].id === id) {
                     self.member = angular.copy(self.members[i]);
                     break;
                  }
              }
          };
              
          self.remove = function(id){
              console.log('id to be deleted', id);
              if(self.member.id === id) {//If it is the one shown on screen, reset screen
                 self.reset();
              }
              self.deleteMember(id);
          };

          
          self.reset = function(){
              self.member= new Member();
              $scope.myForm.$setPristine(); //reset Form
          };

      }]);
