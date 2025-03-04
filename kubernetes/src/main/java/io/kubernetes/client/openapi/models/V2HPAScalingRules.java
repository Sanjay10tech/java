/*
Copyright 2023 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V2HPAScalingPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HPAScalingRules configures the scaling behavior for one direction. These Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.
 */
@ApiModel(description = "HPAScalingRules configures the scaling behavior for one direction. These Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V2HPAScalingRules {
  public static final String SERIALIZED_NAME_POLICIES = "policies";
  @SerializedName(SERIALIZED_NAME_POLICIES)
  private List<V2HPAScalingPolicy> policies = null;

  public static final String SERIALIZED_NAME_SELECT_POLICY = "selectPolicy";
  @SerializedName(SERIALIZED_NAME_SELECT_POLICY)
  private String selectPolicy;

  public static final String SERIALIZED_NAME_STABILIZATION_WINDOW_SECONDS = "stabilizationWindowSeconds";
  @SerializedName(SERIALIZED_NAME_STABILIZATION_WINDOW_SECONDS)
  private Integer stabilizationWindowSeconds;


  public V2HPAScalingRules policies(List<V2HPAScalingPolicy> policies) {

    this.policies = policies;
    return this;
  }

  public V2HPAScalingRules addPoliciesItem(V2HPAScalingPolicy policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
   * @return policies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid")

  public List<V2HPAScalingPolicy> getPolicies() {
    return policies;
  }


  public void setPolicies(List<V2HPAScalingPolicy> policies) {
    this.policies = policies;
  }


  public V2HPAScalingRules selectPolicy(String selectPolicy) {

    this.selectPolicy = selectPolicy;
    return this;
  }

   /**
   * selectPolicy is used to specify which policy should be used. If not set, the default value Max is used.
   * @return selectPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "selectPolicy is used to specify which policy should be used. If not set, the default value Max is used.")

  public String getSelectPolicy() {
    return selectPolicy;
  }


  public void setSelectPolicy(String selectPolicy) {
    this.selectPolicy = selectPolicy;
  }


  public V2HPAScalingRules stabilizationWindowSeconds(Integer stabilizationWindowSeconds) {

    this.stabilizationWindowSeconds = stabilizationWindowSeconds;
    return this;
  }

   /**
   * stabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
   * @return stabilizationWindowSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "stabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).")

  public Integer getStabilizationWindowSeconds() {
    return stabilizationWindowSeconds;
  }


  public void setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
    this.stabilizationWindowSeconds = stabilizationWindowSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2HPAScalingRules v2HPAScalingRules = (V2HPAScalingRules) o;
    return Objects.equals(this.policies, v2HPAScalingRules.policies) &&
        Objects.equals(this.selectPolicy, v2HPAScalingRules.selectPolicy) &&
        Objects.equals(this.stabilizationWindowSeconds, v2HPAScalingRules.stabilizationWindowSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policies, selectPolicy, stabilizationWindowSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2HPAScalingRules {\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    selectPolicy: ").append(toIndentedString(selectPolicy)).append("\n");
    sb.append("    stabilizationWindowSeconds: ").append(toIndentedString(stabilizationWindowSeconds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
