daml sandbox --port 6865
daml ledger upload-dar --host localhost --port 6865 .daml/dist/quickstart-0.0.1.dar
daml script --ledger-host localhost --ledger-port 6865 --dar .daml/dist/quickstart-0.0.1.dar --script-name Main:in
itialize --output-file output.json