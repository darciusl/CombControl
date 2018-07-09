var veiculoModule = angular.module('veiculoModule',[]);

veiculoModule.controller("veiculoControl",function($scope,$http) {
	
	urlVeiculo = 'http://localhost:8080/SistemaCombustivel/rs/veiculo';
	
	$scope.pesquisarVeiculo = function() {
		$http.get(urlVeiculo).success(function (veiculos) {
			$scope.veiculos = veiculos;
		}).error(function (erro) {
			alert(erro);
		});
	}
	
	$scope.salvar = function() {
		if ($scope.veiculo.codigo == '') {
			$http.post(urlVeiculo,$scope.veiculo).success(function(veiculo) {
				$scope.veiculos.push($scope.veiculo);
				$scope.novo();
			}).error(function (erro) {
				alert(erro);
			});
		} else {
			$http.put(urlVeiculo,$scope.veiculo).success(function(veiculo) {
				$scope.pesquisarVeiculo();
				$scope.novo();
			}).error(function (erro) {
				alert(erro);
			});
		}		
	}
	
	$scope.excluir = function() {
		if ($scope.veiculo.codigo == '') {
			alert('Selecione um veiculo');
		} else {
			urlExcluir = urlVeiculo+'/'+$scope.veiculo.codigo;
			$http.delete(urlExcluir).success(function () {
				$scope.pesquisarVeiculo();
				$scope.novo();
			}).error(function (erro) {
				alert(erro);
			});
		}
	}
	
	$scope.novo = function() {
		$scope.veiculo = "";
	}
	
	$scope.selecionaVeiculo = function(veiculo) {
		$scope.veiculo = veiculo;
	}
	
	$scope.pesquisarVeiculo();
	
	
});	