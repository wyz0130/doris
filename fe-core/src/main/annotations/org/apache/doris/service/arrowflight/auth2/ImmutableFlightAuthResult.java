//package org.apache.doris.service.arrowflight.auth2;
//
//import com.google.common.base.MoreObjects;
//import com.google.errorprone.annotations.CanIgnoreReturnValue;
//import com.google.errorprone.annotations.Var;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//import javax.annotation.CheckReturnValue;
//import javax.annotation.Nullable;
//import javax.annotation.ParametersAreNonnullByDefault;
//import javax.annotation.concurrent.Immutable;
//import javax.annotation.concurrent.NotThreadSafe;
//import org.apache.doris.analysis.UserIdentity;
//import org.immutables.value.Generated;
//
///**
// * Immutable implementation of {@link FlightAuthResult}.
// * <p>
// * Use the builder to create immutable instances:
// * {@code ImmutableFlightAuthResult.builder()}.
// */
//@Generated(from = "FlightAuthResult", generator = "Immutables")
//@SuppressWarnings({"all"})
//@ParametersAreNonnullByDefault
//@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
//@Immutable
//@CheckReturnValue
//public final class ImmutableFlightAuthResult
//    implements FlightAuthResult {
//  private final String userName;
//  private final UserIdentity userIdentity;
//  private final String remoteIp;
//
//  private ImmutableFlightAuthResult(
//      String userName,
//      UserIdentity userIdentity,
//      String remoteIp) {
//    this.userName = userName;
//    this.userIdentity = userIdentity;
//    this.remoteIp = remoteIp;
//  }
//
//  /**
//   * @return The value of the {@code userName} attribute
//   */
//  @Override
//  public String getUserName() {
//    return userName;
//  }
//
//  /**
//   * @return The value of the {@code userIdentity} attribute
//   */
//  @Override
//  public UserIdentity getUserIdentity() {
//    return userIdentity;
//  }
//
//  /**
//   * @return The value of the {@code remoteIp} attribute
//   */
//  @Override
//  public String getRemoteIp() {
//    return remoteIp;
//  }
//
//  /**
//   * Copy the current immutable object by setting a value for the {@link FlightAuthResult#getUserName() userName} attribute.
//   * An equals check used to prevent copying of the same value by returning {@code this}.
//   * @param value A new value for userName
//   * @return A modified copy of the {@code this} object
//   */
//  public final ImmutableFlightAuthResult withUserName(String value) {
//    String newValue = Objects.requireNonNull(value, "userName");
//    if (this.userName.equals(newValue)) return this;
//    return new ImmutableFlightAuthResult(newValue, this.userIdentity, this.remoteIp);
//  }
//
//  /**
//   * Copy the current immutable object by setting a value for the {@link FlightAuthResult#getUserIdentity() userIdentity} attribute.
//   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
//   * @param value A new value for userIdentity
//   * @return A modified copy of the {@code this} object
//   */
//  public final ImmutableFlightAuthResult withUserIdentity(UserIdentity value) {
//    if (this.userIdentity == value) return this;
//    UserIdentity newValue = Objects.requireNonNull(value, "userIdentity");
//    return new ImmutableFlightAuthResult(this.userName, newValue, this.remoteIp);
//  }
//
//  /**
//   * Copy the current immutable object by setting a value for the {@link FlightAuthResult#getRemoteIp() remoteIp} attribute.
//   * An equals check used to prevent copying of the same value by returning {@code this}.
//   * @param value A new value for remoteIp
//   * @return A modified copy of the {@code this} object
//   */
//  public final ImmutableFlightAuthResult withRemoteIp(String value) {
//    String newValue = Objects.requireNonNull(value, "remoteIp");
//    if (this.remoteIp.equals(newValue)) return this;
//    return new ImmutableFlightAuthResult(this.userName, this.userIdentity, newValue);
//  }
//
//  /**
//   * This instance is equal to all instances of {@code ImmutableFlightAuthResult} that have equal attribute values.
//   * @return {@code true} if {@code this} is equal to {@code another} instance
//   */
//  @Override
//  public boolean equals(@Nullable Object another) {
//    if (this == another) return true;
//    return another instanceof ImmutableFlightAuthResult
//        && equalTo(0, (ImmutableFlightAuthResult) another);
//  }
//
//  private boolean equalTo(int synthetic, ImmutableFlightAuthResult another) {
//    return userName.equals(another.userName)
//        && userIdentity.equals(another.userIdentity)
//        && remoteIp.equals(another.remoteIp);
//  }
//
//  /**
//   * Computes a hash code from attributes: {@code userName}, {@code userIdentity}, {@code remoteIp}.
//   * @return hashCode value
//   */
//  @Override
//  public int hashCode() {
//    @Var int h = 5381;
//    h += (h << 5) + userName.hashCode();
//    h += (h << 5) + userIdentity.hashCode();
//    h += (h << 5) + remoteIp.hashCode();
//    return h;
//  }
//
//  /**
//   * Prints the immutable value {@code FlightAuthResult} with attribute values.
//   * @return A string representation of the value
//   */
//  @Override
//  public String toString() {
//    return MoreObjects.toStringHelper("FlightAuthResult")
//        .omitNullValues()
//        .add("userName", userName)
//        .add("userIdentity", userIdentity)
//        .add("remoteIp", remoteIp)
//        .toString();
//  }
//
//  /**
//   * Creates an immutable copy of a {@link FlightAuthResult} value.
//   * Uses accessors to get values to initialize the new immutable instance.
//   * If an instance is already immutable, it is returned as is.
//   * @param instance The instance to copy
//   * @return A copied immutable FlightAuthResult instance
//   */
//  public static ImmutableFlightAuthResult copyOf(FlightAuthResult instance) {
//    if (instance instanceof ImmutableFlightAuthResult) {
//      return (ImmutableFlightAuthResult) instance;
//    }
//    return ImmutableFlightAuthResult.builder()
//        .from(instance)
//        .build();
//  }
//
//  /**
//   * Creates a builder for {@link ImmutableFlightAuthResult ImmutableFlightAuthResult}.
//   * <pre>
//   * ImmutableFlightAuthResult.builder()
//   *    .userName(String) // required {@link FlightAuthResult#getUserName() userName}
//   *    .userIdentity(org.apache.doris.analysis.UserIdentity) // required {@link FlightAuthResult#getUserIdentity() userIdentity}
//   *    .remoteIp(String) // required {@link FlightAuthResult#getRemoteIp() remoteIp}
//   *    .build();
//   * </pre>
//   * @return A new ImmutableFlightAuthResult builder
//   */
//  public static ImmutableFlightAuthResult.Builder builder() {
//    return new ImmutableFlightAuthResult.Builder();
//  }
//
//  /**
//   * Builds instances of type {@link ImmutableFlightAuthResult ImmutableFlightAuthResult}.
//   * Initialize attributes and then invoke the {@link #build()} method to create an
//   * immutable instance.
//   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
//   * but instead used immediately to create instances.</em>
//   */
//  @Generated(from = "FlightAuthResult", generator = "Immutables")
//  @NotThreadSafe
//  public static final class Builder {
//    private static final long INIT_BIT_USER_NAME = 0x1L;
//    private static final long INIT_BIT_USER_IDENTITY = 0x2L;
//    private static final long INIT_BIT_REMOTE_IP = 0x4L;
//    private long initBits = 0x7L;
//
//    private @Nullable String userName;
//    private @Nullable UserIdentity userIdentity;
//    private @Nullable String remoteIp;
//
//    private Builder() {
//    }
//
//    /**
//     * Fill a builder with attribute values from the provided {@code FlightAuthResult} instance.
//     * Regular attribute values will be replaced with those from the given instance.
//     * Absent optional values will not replace present values.
//     * @param instance The instance from which to copy values
//     * @return {@code this} builder for use in a chained invocation
//     */
//    @CanIgnoreReturnValue
//    public final Builder from(FlightAuthResult instance) {
//      Objects.requireNonNull(instance, "instance");
//      userName(instance.getUserName());
//      userIdentity(instance.getUserIdentity());
//      remoteIp(instance.getRemoteIp());
//      return this;
//    }
//
//    /**
//     * Initializes the value for the {@link FlightAuthResult#getUserName() userName} attribute.
//     * @param userName The value for userName
//     * @return {@code this} builder for use in a chained invocation
//     */
//    @CanIgnoreReturnValue
//    public final Builder userName(String userName) {
//      this.userName = Objects.requireNonNull(userName, "userName");
//      initBits &= ~INIT_BIT_USER_NAME;
//      return this;
//    }
//
//    /**
//     * Initializes the value for the {@link FlightAuthResult#getUserIdentity() userIdentity} attribute.
//     * @param userIdentity The value for userIdentity
//     * @return {@code this} builder for use in a chained invocation
//     */
//    @CanIgnoreReturnValue
//    public final Builder userIdentity(UserIdentity userIdentity) {
//      this.userIdentity = Objects.requireNonNull(userIdentity, "userIdentity");
//      initBits &= ~INIT_BIT_USER_IDENTITY;
//      return this;
//    }
//
//    /**
//     * Initializes the value for the {@link FlightAuthResult#getRemoteIp() remoteIp} attribute.
//     * @param remoteIp The value for remoteIp
//     * @return {@code this} builder for use in a chained invocation
//     */
//    @CanIgnoreReturnValue
//    public final Builder remoteIp(String remoteIp) {
//      this.remoteIp = Objects.requireNonNull(remoteIp, "remoteIp");
//      initBits &= ~INIT_BIT_REMOTE_IP;
//      return this;
//    }
//
//    /**
//     * Builds a new {@link ImmutableFlightAuthResult ImmutableFlightAuthResult}.
//     * @return An immutable instance of FlightAuthResult
//     * @throws java.lang.IllegalStateException if any required attributes are missing
//     */
//    public ImmutableFlightAuthResult build() {
//      if (initBits != 0) {
//        throw new IllegalStateException(formatRequiredAttributesMessage());
//      }
//      return new ImmutableFlightAuthResult(userName, userIdentity, remoteIp);
//    }
//
//    private String formatRequiredAttributesMessage() {
//      List<String> attributes = new ArrayList<>();
//      if ((initBits & INIT_BIT_USER_NAME) != 0) attributes.add("userName");
//      if ((initBits & INIT_BIT_USER_IDENTITY) != 0) attributes.add("userIdentity");
//      if ((initBits & INIT_BIT_REMOTE_IP) != 0) attributes.add("remoteIp");
//      return "Cannot build FlightAuthResult, some of required attributes are not set " + attributes;
//    }
//  }
//}
