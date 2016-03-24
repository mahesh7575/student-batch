var batchCreationModule = angular.module('batchCreationModule', []);
batchCreationModule.controller('batchController', [ '$http', '$scope', function($http, $scope) {
	
	$scope.students = [{}];
	$scope.submitted= false;
	$scope.createBatch = function(batchObject) {
		if($scope.batchForm.$valid) {
			console.log(batchObject);
		}else{
			$scope.submitted=true;
			console.log("error");
		}
		
		        /*$http.post("/studentBatches/batches/trainingPrograms").then(function(response) {
					$scope.data = response.data;
					console.log($scope.data);
					if($scope.data.successful) {
						alert("success");
					} else {
						showError($scope.data.errorMessage);
						var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
						jQuery("#errorDiv").html(message);
						
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});*/
	};
	
	$scope.addStudentRow = function() {
		$scope.students.push({});
	};
	
	
	$scope.deleteStudentRow = function(student) {
		var index = $scope.students.indexOf(student);
		$scope.students.splice(index,1);
		console.log($scope.students.length);
		
		
	};
	
} ]);
