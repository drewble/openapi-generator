=begin
#Echo Server API

#Echo Server API

The version of the OpenAPI document: 0.1.0
Contact: team@openapitools.org
Generated by: https://openapi-generator.tech
Generator version: 8.0.0-SNAPSHOT

=end

require 'cgi'

module OpenapiClient
  class PathApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Test path parameter(s)
    # Test path parameter(s)
    # @param path_string [String] 
    # @param path_integer [Integer] 
    # @param enum_nonref_string_path [String] 
    # @param enum_ref_string_path [StringEnumRef] 
    # @param [Hash] opts the optional parameters
    # @return [String]
    def tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path(path_string, path_integer, enum_nonref_string_path, enum_ref_string_path, opts = {})
      data, _status_code, _headers = tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path_with_http_info(path_string, path_integer, enum_nonref_string_path, enum_ref_string_path, opts)
      data
    end

    # Test path parameter(s)
    # Test path parameter(s)
    # @param path_string [String] 
    # @param path_integer [Integer] 
    # @param enum_nonref_string_path [String] 
    # @param enum_ref_string_path [StringEnumRef] 
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path_with_http_info(path_string, path_integer, enum_nonref_string_path, enum_ref_string_path, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PathApi.tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path ...'
      end
      # verify the required parameter 'path_string' is set
      if @api_client.config.client_side_validation && path_string.nil?
        fail ArgumentError, "Missing the required parameter 'path_string' when calling PathApi.tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path"
      end
      # verify the required parameter 'path_integer' is set
      if @api_client.config.client_side_validation && path_integer.nil?
        fail ArgumentError, "Missing the required parameter 'path_integer' when calling PathApi.tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path"
      end
      # verify the required parameter 'enum_nonref_string_path' is set
      if @api_client.config.client_side_validation && enum_nonref_string_path.nil?
        fail ArgumentError, "Missing the required parameter 'enum_nonref_string_path' when calling PathApi.tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path"
      end
      # verify enum value
      allowable_values = ["success", "failure", "unclassified"]
      if @api_client.config.client_side_validation && !allowable_values.include?(enum_nonref_string_path)
        fail ArgumentError, "invalid value for \"enum_nonref_string_path\", must be one of #{allowable_values}"
      end
      # verify the required parameter 'enum_ref_string_path' is set
      if @api_client.config.client_side_validation && enum_ref_string_path.nil?
        fail ArgumentError, "Missing the required parameter 'enum_ref_string_path' when calling PathApi.tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path"
      end
      # resource path
      local_var_path = '/path/string/{path_string}/integer/{path_integer}/{enum_nonref_string_path}/{enum_ref_string_path}'.sub('{' + 'path_string' + '}', CGI.escape(path_string.to_s)).sub('{' + 'path_integer' + '}', CGI.escape(path_integer.to_s)).sub('{' + 'enum_nonref_string_path' + '}', CGI.escape(enum_nonref_string_path.to_s)).sub('{' + 'enum_ref_string_path' + '}', CGI.escape(enum_ref_string_path.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['text/plain']) unless header_params['Accept']

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'String'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"PathApi.tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PathApi#tests_path_string_path_string_integer_path_integer_enum_nonref_string_path_enum_ref_string_path\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
