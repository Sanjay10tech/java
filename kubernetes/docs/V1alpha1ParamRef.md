

# V1alpha1ParamRef

ParamRef describes how to locate the params to be used as input to expressions of rules applied by a policy binding.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | &#x60;name&#x60; is the name of the resource being referenced.  &#x60;name&#x60; and &#x60;selector&#x60; are mutually exclusive properties. If one is set, the other must be unset. |  [optional]
**namespace** | **String** | namespace is the namespace of the referenced resource. Allows limiting the search for params to a specific namespace. Applies to both &#x60;name&#x60; and &#x60;selector&#x60; fields.  A per-namespace parameter may be used by specifying a namespace-scoped &#x60;paramKind&#x60; in the policy and leaving this field empty.  - If &#x60;paramKind&#x60; is cluster-scoped, this field MUST be unset. Setting this field results in a configuration error.  - If &#x60;paramKind&#x60; is namespace-scoped, the namespace of the object being evaluated for admission will be used when this field is left unset. Take care that if this is left empty the binding must not match any cluster-scoped resources, which will result in an error. |  [optional]
**parameterNotFoundAction** | **String** | &#x60;parameterNotFoundAction&#x60; controls the behavior of the binding when the resource exists, and name or selector is valid, but there are no parameters matched by the binding. If the value is set to &#x60;Allow&#x60;, then no matched parameters will be treated as successful validation by the binding. If set to &#x60;Deny&#x60;, then no matched parameters will be subject to the &#x60;failurePolicy&#x60; of the policy.  Allowed values are &#x60;Allow&#x60; or &#x60;Deny&#x60; Default to &#x60;Deny&#x60; |  [optional]
**selector** | [**V1LabelSelector**](V1LabelSelector.md) |  |  [optional]



