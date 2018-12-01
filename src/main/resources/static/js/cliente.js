var clienteModulo = angular.module('clienteModulo',[]);

clienteModulo.controller("clienteController", function($scope, $http) {
	$http.get('js/CadClienteJson.json').then(function (response) {
		$scope.cliente = response.data.clientes;
	})
	

});