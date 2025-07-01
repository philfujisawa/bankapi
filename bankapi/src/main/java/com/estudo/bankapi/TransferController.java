package com.estudo.bankapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/transfer")
public class TransferController {
    private final Map<String, TransferRequest> processedTransfers = new HashMap<>();

    @PostMapping
    public ResponseEntity<?> makeTransfer (@RequestBody TransferRequest request) {
        if (processedTransfers.containsKey(request.getIdempotencyKey())){
            return ResponseEntity.ok("Transferência já foi processada. Chave de Idempotência: " + request.getIdempotencyKey());
        }

        processedTransfers.put(request.getIdempotencyKey(), request);

        return  ResponseEntity.ok("Transferência completada com sucesso. Chave Idempotência: " + request.getIdempotencyKey());
    }

    @GetMapping("/count")
    public ResponseEntity<?> getTransactionCount() {
        int total = processedTransfers.size();
        return ResponseEntity.ok("Total de transações processadas: " + total);
    }

}
