SELECT 'CREATE DATABASE practice' WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = 'practice') ;