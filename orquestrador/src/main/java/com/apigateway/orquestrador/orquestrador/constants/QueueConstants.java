package com.apigateway.orquestrador.orquestrador.constants;

public class QueueConstants {
    // Client-related queues
    public static final String CLIENTE_CREATED = "cliente.created";
    public static final String CREATE_CLIENT_ACCOUNT = "account.create.client";
    public static final String CLIENT_ACCOUNT_CREATED = "account.created.client";
    public static final String CLIENT_ACCOUNT_APPROVED = "account.approved.client";
    public static final String CLIENT_ACCOUNT_DECLINED = "account.declined.client";
    public static final String CREATE_CLIENT_USER = "user.create.client";
    public static final String CLIENT_ACCOUNT_READ_CREATED = "account.read.created.client";
    public static final String CLIENT_ACCOUNT_READ_APPROVED = "account.read.approved.client";

    // Gerente-related queues
    public static final String ASSIGN_MANAGER_TO_ACCOUNT = "account.assign.manager";
    public static final String MANAGER_ASSIGNED = "manager.assigned";
    public static final String MANAGER_CREATED = "manager.created";
    public static final String MANAGER_EDITED = "manager.edited";
    public static final String MANAGER_REMOVED = "manager.removed";
    public static final String CREATE_MANAGER_USER = "user.create.manager";
    public static final String UPDATE_MANAGER_USER = "user.update.manager";
    public static final String REMOVE_MANAGER_USER = "user.remove.manager";
    public static final String UPDATE_MANAGER_ACCOUNT_BALANCE = "account.balance.update.manager";
    public static final String ASSIGN_MANAGER_ACCOUNT_READ = "account.read.assign.manager";

    // Account & transaction-related queues
    public static final String ACCOUNT_TRANSACTION_COMPLETED = "account.transaction.completed";
    public static final String ACCOUNT_BALANCE_UPDATED = "account.balance.updated";

    // Array of all queues for convenience
    public static final String[] ALL_QUEUES = {
            CLIENTE_CREATED, CREATE_CLIENT_ACCOUNT, CLIENT_ACCOUNT_CREATED, CLIENT_ACCOUNT_APPROVED,
            CLIENT_ACCOUNT_DECLINED, CREATE_CLIENT_USER, CLIENT_ACCOUNT_READ_CREATED, CLIENT_ACCOUNT_READ_APPROVED,
            ASSIGN_MANAGER_TO_ACCOUNT, MANAGER_ASSIGNED, MANAGER_CREATED, MANAGER_EDITED,
            MANAGER_REMOVED, CREATE_MANAGER_USER, UPDATE_MANAGER_USER, REMOVE_MANAGER_USER,
            UPDATE_MANAGER_ACCOUNT_BALANCE, ASSIGN_MANAGER_ACCOUNT_READ, ACCOUNT_TRANSACTION_COMPLETED,
            ACCOUNT_BALANCE_UPDATED
    };
}