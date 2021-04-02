package org.infinispan.tutorial.simple.spring.remote;

import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

import java.io.Serializable;
import java.util.Objects;

public class BasqueName implements Serializable {

   private final int id;
   private final String name;

   @ProtoFactory
   public BasqueName(int id, String name) {
      this.id = id;
      this.name = name;
   }

   @ProtoField(number = 1, defaultValue = "-1")
   public int getId() {
      return id;
   }

   @ProtoField(2)
   public String getName() {
      return this.name;
   }


   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      BasqueName that = (BasqueName) o;
      return id == that.id &&
            Objects.equals(name, that.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name);
   }

   @Override
   public String toString() {
      return "BasqueName{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
   }
}
