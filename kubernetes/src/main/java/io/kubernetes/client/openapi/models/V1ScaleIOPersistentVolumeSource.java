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
import io.kubernetes.client.openapi.models.V1SecretReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume
 */
@ApiModel(description = "ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1ScaleIOPersistentVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_PROTECTION_DOMAIN = "protectionDomain";
  @SerializedName(SERIALIZED_NAME_PROTECTION_DOMAIN)
  private String protectionDomain;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1SecretReference secretRef;

  public static final String SERIALIZED_NAME_SSL_ENABLED = "sslEnabled";
  @SerializedName(SERIALIZED_NAME_SSL_ENABLED)
  private Boolean sslEnabled;

  public static final String SERIALIZED_NAME_STORAGE_MODE = "storageMode";
  @SerializedName(SERIALIZED_NAME_STORAGE_MODE)
  private String storageMode;

  public static final String SERIALIZED_NAME_STORAGE_POOL = "storagePool";
  @SerializedName(SERIALIZED_NAME_STORAGE_POOL)
  private String storagePool;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  private String system;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;


  public V1ScaleIOPersistentVolumeSource fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

   /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Default is \&quot;xfs\&quot;
   * @return fsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Default is \"xfs\"")

  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public V1ScaleIOPersistentVolumeSource gateway(String gateway) {

    this.gateway = gateway;
    return this;
  }

   /**
   * gateway is the host address of the ScaleIO API Gateway.
   * @return gateway
  **/
  @ApiModelProperty(required = true, value = "gateway is the host address of the ScaleIO API Gateway.")

  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public V1ScaleIOPersistentVolumeSource protectionDomain(String protectionDomain) {

    this.protectionDomain = protectionDomain;
    return this;
  }

   /**
   * protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
   * @return protectionDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.")

  public String getProtectionDomain() {
    return protectionDomain;
  }


  public void setProtectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
  }


  public V1ScaleIOPersistentVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

   /**
   * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1ScaleIOPersistentVolumeSource secretRef(V1SecretReference secretRef) {

    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @ApiModelProperty(required = true, value = "")

  public V1SecretReference getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(V1SecretReference secretRef) {
    this.secretRef = secretRef;
  }


  public V1ScaleIOPersistentVolumeSource sslEnabled(Boolean sslEnabled) {

    this.sslEnabled = sslEnabled;
    return this;
  }

   /**
   * sslEnabled is the flag to enable/disable SSL communication with Gateway, default false
   * @return sslEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "sslEnabled is the flag to enable/disable SSL communication with Gateway, default false")

  public Boolean getSslEnabled() {
    return sslEnabled;
  }


  public void setSslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
  }


  public V1ScaleIOPersistentVolumeSource storageMode(String storageMode) {

    this.storageMode = storageMode;
    return this;
  }

   /**
   * storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
   * @return storageMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.")

  public String getStorageMode() {
    return storageMode;
  }


  public void setStorageMode(String storageMode) {
    this.storageMode = storageMode;
  }


  public V1ScaleIOPersistentVolumeSource storagePool(String storagePool) {

    this.storagePool = storagePool;
    return this;
  }

   /**
   * storagePool is the ScaleIO Storage Pool associated with the protection domain.
   * @return storagePool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "storagePool is the ScaleIO Storage Pool associated with the protection domain.")

  public String getStoragePool() {
    return storagePool;
  }


  public void setStoragePool(String storagePool) {
    this.storagePool = storagePool;
  }


  public V1ScaleIOPersistentVolumeSource system(String system) {

    this.system = system;
    return this;
  }

   /**
   * system is the name of the storage system as configured in ScaleIO.
   * @return system
  **/
  @ApiModelProperty(required = true, value = "system is the name of the storage system as configured in ScaleIO.")

  public String getSystem() {
    return system;
  }


  public void setSystem(String system) {
    this.system = system;
  }


  public V1ScaleIOPersistentVolumeSource volumeName(String volumeName) {

    this.volumeName = volumeName;
    return this;
  }

   /**
   * volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
   * @return volumeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.")

  public String getVolumeName() {
    return volumeName;
  }


  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ScaleIOPersistentVolumeSource v1ScaleIOPersistentVolumeSource = (V1ScaleIOPersistentVolumeSource) o;
    return Objects.equals(this.fsType, v1ScaleIOPersistentVolumeSource.fsType) &&
        Objects.equals(this.gateway, v1ScaleIOPersistentVolumeSource.gateway) &&
        Objects.equals(this.protectionDomain, v1ScaleIOPersistentVolumeSource.protectionDomain) &&
        Objects.equals(this.readOnly, v1ScaleIOPersistentVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, v1ScaleIOPersistentVolumeSource.secretRef) &&
        Objects.equals(this.sslEnabled, v1ScaleIOPersistentVolumeSource.sslEnabled) &&
        Objects.equals(this.storageMode, v1ScaleIOPersistentVolumeSource.storageMode) &&
        Objects.equals(this.storagePool, v1ScaleIOPersistentVolumeSource.storagePool) &&
        Objects.equals(this.system, v1ScaleIOPersistentVolumeSource.system) &&
        Objects.equals(this.volumeName, v1ScaleIOPersistentVolumeSource.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, gateway, protectionDomain, readOnly, secretRef, sslEnabled, storageMode, storagePool, system, volumeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScaleIOPersistentVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    protectionDomain: ").append(toIndentedString(protectionDomain)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    sslEnabled: ").append(toIndentedString(sslEnabled)).append("\n");
    sb.append("    storageMode: ").append(toIndentedString(storageMode)).append("\n");
    sb.append("    storagePool: ").append(toIndentedString(storagePool)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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
