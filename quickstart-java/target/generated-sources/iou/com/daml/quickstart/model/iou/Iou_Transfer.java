package com.daml.quickstart.model.iou;

import com.daml.ledger.javaapi.data.Party;
import com.daml.ledger.javaapi.data.Value;
import com.daml.ledger.javaapi.data.codegen.DamlRecord;
import com.daml.ledger.javaapi.data.codegen.PrimitiveValueDecoders;
import com.daml.ledger.javaapi.data.codegen.ValueDecoder;
import java.lang.Deprecated;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Iou_Transfer extends DamlRecord<Iou_Transfer> {
  public static final String _packageId = "48bdcb873e9a4aec8b84e1cbc1cfc3faff3d313449f2164e598c1918f38fa15d";

  public final String newOwner;

  public Iou_Transfer(String newOwner) {
    this.newOwner = newOwner;
  }

  /**
   * @deprecated since Daml 2.5.0; use {@code valueDecoder} instead */
  @Deprecated
  public static Iou_Transfer fromValue(Value value$) throws IllegalArgumentException {
    return valueDecoder().decode(value$);
  }

  public static ValueDecoder<Iou_Transfer> valueDecoder() throws IllegalArgumentException {
    return value$ -> {
      Value recordValue$ = value$;
      List<com.daml.ledger.javaapi.data.DamlRecord.Field> fields$ = PrimitiveValueDecoders.recordCheck(1,
          recordValue$);
      String newOwner = PrimitiveValueDecoders.fromParty.decode(fields$.get(0).getValue());
      return new Iou_Transfer(newOwner);
    } ;
  }

  public com.daml.ledger.javaapi.data.DamlRecord toValue() {
    ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field> fields = new ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field>(1);
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("newOwner", new Party(this.newOwner)));
    return new com.daml.ledger.javaapi.data.DamlRecord(fields);
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (!(object instanceof Iou_Transfer)) {
      return false;
    }
    Iou_Transfer other = (Iou_Transfer) object;
    return Objects.equals(this.newOwner, other.newOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.newOwner);
  }

  @Override
  public String toString() {
    return String.format("com.daml.quickstart.model.iou.Iou_Transfer(%s)", this.newOwner);
  }
}
