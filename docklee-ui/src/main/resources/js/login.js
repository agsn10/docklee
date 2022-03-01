$( "#bt_login" ).click(function() {
	$("#loadMe").modal("show");
	$.post('${base_url}',  {  ACTION: 'doLoginAction', USERNAME: $('#txt_username').val(), PASSWORD: $('#txt_pasword').val()},
		function(data,status){ 
			var json = JSON.parse(data);
			if(json.status == 'SUCCESS'){
				
				$('#txt_loading').text('Redirecting...');
				
				setTimeout(function() {
					$("#loadMe").modal("hide");
					
					var url = '${base_url}';
					var form = $('<form action="' + url + '" method="post">' + '<input type="hidden" name="ACTION" value="doRedirectLoginAction" />' + '</form>');
					$('body').append(form);
					form.submit();
				}, 2000);
				
			}else{
				setTimeout(function() {				
					$("#loadMe").modal("hide");
				}, 500);
				
				$('#txt_username').val('');
				$('#txt_pasword').val('');
				
				toastr.options = {
						"closeButton": false,
						"debug": false,
						"newestOnTop": false,
						"progressBar": true,
						"positionClass": "md-toast-top-center",
						"preventDuplicates": false,
						"onclick": null,
						"showDuration": 300,
						"hideDuration": 1000,
						"timeOut": 2000,
						"extendedTimeOut": 1000,
						"showEasing": "swing",
						"hideEasing": "linear",
						"showMethod": "fadeIn",
						"hideMethod": "fadeOut"
						}
				toastr.error(json.content);
			}
		}
	);
	
});