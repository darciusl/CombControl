var abastecimentoModule = angular.module('abastecimentoModule',[]);

abastecimentoModule.controller("abastecimentoControl",function($scope,$http) {
	
	urlVeiculo = 'http://localhost:8080/SistemaCombustivel/rs/veiculo';
	
	urlabastecimento = 'http://localhost:8080/SistemaCombustivel/rs/abastecimento';
	
	$scope.pesquisarVeiculo = function() {
		$http.get(urlVeiculo).success(function (veiculos) {
			$scope.veiculos = veiculos;
		}).error(function (erro) {
			alert(erro);
		});
	}
	
	$scope.pesquisarabastecimento = function() {
		$http.get(urlabastecimento).success(function (abastecimentos) {
			$scope.abastecimentos = abastecimentos;
		}).error(function (erro) {
			alert(erro);
		});
	}
	
	$scope.salvar = function() {
		if ($scope.abastecimento.codigo == '') {
			$http.post(urlabastecimento,$scope.abastecimento).success(function(abastecimento) {
				$scope.abastecimentos.push($scope.abastecimento);
				$scope.novo();
			}).error(function (erro) {
				alert(erro);
			});
		} else {
			$http.put(urlabastecimento,$scope.abastecimento).success(function(abastecimento) {
				$scope.pesquisarabastecimento();
				$scope.novo();
			}).error(function (erro) {
				alert(erro);
			});
		}		
	}
	
	$scope.excluir = function() {
		if ($scope.abastecimento.codigo == '') {
			alert('Selecione um abastecimento');
		} else {
			urlExcluir = urlabastecimento+'/'+$scope.abastecimento.codigo;
			$http.delete(urlExcluir).success(function () {
				$scope.pesquisarabastecimento();
				$scope.novo();
			}).error(function (erro) {
				alert(erro);
			});
		}
	}
	
	$scope.novo = function() {
		$scope.abastecimento = "";
	}
	
	$scope.selecionaabastecimento = function(abastecimento) {
		$scope.abastecimento = abastecimento;
	}
	
	$scope.pesquisarVeiculo();
	$scope.pesquisarabastecimento();
	
	
});	