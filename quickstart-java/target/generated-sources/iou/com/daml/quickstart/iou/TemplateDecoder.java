package com.daml.quickstart.iou;

import com.daml.ledger.javaapi.data.Contract;
import com.daml.ledger.javaapi.data.CreatedEvent;
import com.daml.ledger.javaapi.data.Identifier;
import com.daml.ledger.javaapi.data.codegen.ContractDecoder;
import com.daml.quickstart.model.iou.Iou;
import com.daml.quickstart.model.iou.IouTransfer;
import com.daml.quickstart.model.ioutrade.IouTrade;
import java.lang.IllegalArgumentException;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class TemplateDecoder {
  private static final ContractDecoder contractDecoder;

  static {
    contractDecoder = new ContractDecoder(Arrays.asList(IouTransfer.COMPANION, Iou.COMPANION,
        IouTrade.COMPANION));
  }

  public static Contract fromCreatedEvent(CreatedEvent event) throws IllegalArgumentException {
    return contractDecoder.fromCreatedEvent(event);
  }

  public static Optional<Function<CreatedEvent, Contract>> getDecoder(Identifier templateId) {
    return contractDecoder.getDecoder(templateId);
  }
}
